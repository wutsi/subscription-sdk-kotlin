package com.wutsi.subscription.dto

import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class Plan(
  public val id: Long = 0,
  public val siteId: Long = 0,
  public val partnerId: Long = 0,
  public val name: String = "",
  public val description: String = "",
  public val active: Boolean = true,
  public val rate: PlanRate = PlanRate(),
  public val convertedRate: PlanRate = PlanRate()
)
