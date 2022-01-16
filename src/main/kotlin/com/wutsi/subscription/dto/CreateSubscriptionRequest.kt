package com.wutsi.subscription.dto

import kotlin.Long

public data class CreateSubscriptionRequest(
  public val planId: Long? = null,
  public val subscriberId: Long? = null,
  public val orderId: Long? = null
)
