import { Component, inject, OnInit } from '@angular/core';
import { OidcSecurityService } from "angular-auth-oidc-client";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit {

  private readonly oidcSecurityService = inject(OidcSecurityService);
  isAuthenticated = false;
  username = "";

  ngOnInit(): void {
    this.oidcSecurityService.isAuthenticated$.subscribe(
      ({ isAuthenticated }) => {
        this.isAuthenticated = isAuthenticated;
      }
    )
    this.oidcSecurityService.userData$.subscribe(
      ({ userData }) => {
        if (userData && userData.preferred_username) {
          this.username = userData.preferred_username;
        } else {
          this.username = "";
        }
      }
    )
  }

  login(): void {
    this.oidcSecurityService.authorize();
  }

  logout(): void {
    this.oidcSecurityService
      .logoff()
      .subscribe((result) => console.log(result));
  }
}
