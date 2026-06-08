package com.example.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Сущность Room — строка в таблице products.
 *
 * Столбцы:
 *   productId    — целое число, первичный ключ, автогенерация (см. п.4 ЛР).
 *   productName  — строка с названием товара.
 *   quantity     — целое число, количество (без @ColumnInfo: имя столбца == имя поля).
 */
@Entity(tableName = "products")
class Product {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "productId")
    var id: Int = 0

    @ColumnInfo(name = "productName")
    var productName: String = ""

    var quantity: Int = 0

    constructor()

    constructor(productname: String, quantity: Int) {
        this.productName = productname
        this.quantity = quantity
    }
}
