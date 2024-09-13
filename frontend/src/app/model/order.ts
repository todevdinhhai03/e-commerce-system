export interface Order {
    orderId?: number;
    orderNumber?: string;
    skuCode: string;
    price: number;
    quantity: number;
    userDetails: UserDetails
}

export interface UserDetails {
    email: string;
    firstName: string;
    lastName: string;
}