package io.educative.models

import kotlinx.serialization.Serializable

@Serializable
data class InvoiceItem(
    val dummy: Int = 0
)

@Serializable
data class Invoice(
    val dummy: Int = 0
)

@Serializable
data class InvoiceJson(
    val dummy: Int = 0
)