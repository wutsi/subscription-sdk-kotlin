package com.wutsi.subscription.dto

import kotlin.Long
import kotlin.String

public data class CreatePlanRequest(
  public val siteId: Long? = null,
  public val partnerId: Long? = null,
  public val name: String = "",
  public val description: String = "",
  public val monthlyRate: Long = 0,
  public val yearlyRate: Long = 0,
  public val currency: String = ""
)
