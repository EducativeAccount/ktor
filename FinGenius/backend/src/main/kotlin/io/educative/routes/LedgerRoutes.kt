package io.educative.routes

import io.educative.models.Partner
import io.educative.models.Invoice
import io.educative.models.LedgerItem
import io.educative.models.LedgerJson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.educative.models.Database
import io.educative.models.Transaction
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.time.LocalDate
import java.text.SimpleDateFormat
import org.litote.kmongo.eq
import org.litote.kmongo.or
import java.math.BigDecimal

fun Route.ledgerRoutes(){
    val database = Database()
    val invoicesCollection = database.db.getCollection<Invoice>("invoices")
    val transactionsCollection = database.db.getCollection<Transaction>("transactions")
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/ledger"){
        // Route to get ledger items
    }
}