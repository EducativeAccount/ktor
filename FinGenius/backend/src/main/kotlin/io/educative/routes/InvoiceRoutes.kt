package io.educative.routes

import io.educative.models.Invoice
import io.educative.models.Partner
import io.educative.models.InvoiceJson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.litote.kmongo.eq
import io.educative.models.Database
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun Route.invoiceRoutes(){
    val database = Database()
    val invoicesCollection = database.db.getCollection<Invoice>("invoices")
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/invoices"){
        // Route to add an invoice
        
        // Route to get invoice(s)
    }
}