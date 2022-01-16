package com.wutsi.subscription.dto

import kotlin.collections.List

public data class SearchPlanResponse(
  public val plans: List<Plan> = emptyList()
)
