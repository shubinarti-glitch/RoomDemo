package com.example.roomdemo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Data Access Object — методы для доступа к таблице products.
 *
 *  insertProduct    — вставка нового товара (см. п.5 ЛР).
 *  findProduct      — поиск по точному названию.
 *  deleteProduct    — удаление по названию.
 *  getAllProducts   — возвращает LiveData<List<Product>>, через который Compose
 *                     автоматически обновляет UI при каждом изменении таблицы.
 */
@Dao
interface ProductDao {

    @Insert
    fun insertProduct(product: Product)

    @Query("SELECT * FROM products WHERE productName = :name")
    fun findProduct(name: String): List<Product>

    @Query("DELETE FROM products WHERE productName = :name")
    fun deleteProduct(name: String)

    @Query("SELECT * FROM products")
    fun getAllProducts(): LiveData<List<Product>>
}
