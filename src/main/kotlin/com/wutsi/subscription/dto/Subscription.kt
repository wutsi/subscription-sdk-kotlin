package com.wutsi.subscription.dto

import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class Subscription(
  public val id: Long = 0,
  public val siteId: Long = 0,
  public val plan: Plan = Plan(),
  public val subscriberId: Long = 0,
  public val orderId: Long = 0,
  public val startDate: LocalDate = LocalDate.now(),
  public val endDate: LocalDate = LocalDate.now(),
  public val status: String = "",
  public val subscriptionDateTime: OffsetDateTime = OffsetDateTime.now()
)
