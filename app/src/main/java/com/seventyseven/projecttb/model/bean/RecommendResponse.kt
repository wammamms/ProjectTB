package com.seventyseven.projecttb.model.bean

data class RecommendResponse(
    val `data`: RecommendData,
    val status: Int
)

data class RecommendData(
    val message: List<Product>
)