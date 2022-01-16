package com.wutsi.subscription.dto

import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class UpdatePlanRequest(
  public val name: String = "",
  public val description: String = "",
  public val active: Boolean = false,
  public val monthlyRate: Long = 0,
  public val yearlyRate: Long = 0
)
