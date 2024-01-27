package io.educative.routes

import io.educative.models.Partner
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.litote.kmongo.eq
import org.litote.kmongo.and
import io.educative.models.Database

fun Route.partnerRoutes(){
    val database = Database()
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/partners"){
        // Route to add a partner

        // Route to edit a partner

        // Route to get partner(s)
    }
}