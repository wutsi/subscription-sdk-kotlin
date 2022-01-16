package com.wutsi.subscription.dto

import kotlin.collections.List

public data class SearchSubscriptionResponse(
  public val subscriptions: List<Subscription> = emptyList()
)
