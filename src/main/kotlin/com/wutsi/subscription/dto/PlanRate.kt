package com.wutsi.subscription.dto

import kotlin.Double
import kotlin.Long
import kotlin.String

public data class PlanRate(
  public val id: Long = 0,
  public val monthly: Long = 0,
  public val yearly: Long = 0,
  public val currency: String = "",
  public val exchangeRate: Double? = null
)
