CREATE TABLE `t_inventory`
(
    `inventory_id`       bigint(20)  AUTO_INCREMENT,
    `sku_code`  varchar(255) DEFAULT NULL,
    `quantity` int(11)      DEFAULT NULL,
    PRIMARY KEY (`inventory_id`)
);