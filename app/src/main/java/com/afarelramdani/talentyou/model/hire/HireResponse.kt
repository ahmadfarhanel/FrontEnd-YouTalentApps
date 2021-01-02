package com.afarelramdani.talentyou.model.hire

import com.google.gson.annotations.SerializedName

data class HireResponse(val success: Boolean, val message: String, val data: List<Hire>) {
    data class Hire(
        @SerializedName("hr_id") val hireId: String?,
        @SerializedName("en_id") val engineerId: String?,
        @SerializedName("pj_id") val projectId: String?,
        @SerializedName("hr_price") val hirePrice: Long?,
        @SerializedName("hr_message") val hireMessage: String?,
        @SerializedName("hr_status") val hireStatus: String?,
        @SerializedName("hr_date_confirm") val hireDateConfirm: String?,
        @SerializedName("hr_created_at") val hireCreated: String?
    )
}