package com.test.foodappchallenge.data.entity

data class FoodEntity (
        var image: String? = null,
        var description: String? = null,
        var favoriteCount: Int? = null,
        var dateTime: String? = null,
        var user: UserEntity? = null
)