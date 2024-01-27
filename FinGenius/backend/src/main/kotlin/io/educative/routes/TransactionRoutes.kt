package io.educative.routes

import io.educative.models.Partner
import io.educative.models.Transaction
import io.educative.models.TransactionJson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.litote.kmongo.eq
import org.litote.kmongo.or
import io.educative.models.Database
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun Route.transactionRoutes(){
    val database = Database()
    val transactionsCollection = database.db.getCollection<Transaction>("transactions")
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/transactions") {
        // Route to add a transaction

        // Route to get all transactions
    }
}