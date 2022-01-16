package com.wutsi.subscription

import com.wutsi.subscription.dto.CountSubscriptionResponse
import com.wutsi.subscription.dto.CreatePlanRequest
import com.wutsi.subscription.dto.CreatePlanResponse
import com.wutsi.subscription.dto.CreateSubscriptionRequest
import com.wutsi.subscription.dto.CreateSubscriptionResponse
import com.wutsi.subscription.dto.GetPlanResponse
import com.wutsi.subscription.dto.GetSubscriptionResponse
import com.wutsi.subscription.dto.SearchPlanResponse
import com.wutsi.subscription.dto.SearchSubscriptionResponse
import com.wutsi.subscription.dto.UpdatePlanRequest
import com.wutsi.subscription.dto.UpdatePlanResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String

public interface SubscriptionApi {
  @RequestLine("POST /v1/plans")
  @Headers(value=["Content-Type: application/json"])
  public fun createPlan(request: CreatePlanRequest): CreatePlanResponse

  @RequestLine("GET /v1/plans/{plan-id}?currency={currency}&rate-id={rate-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getPlan(
    @Param("plan-id") planId: Long,
    @Param("currency") currency: String? = null,
    @Param("rate-id") rateId: Long? = null
  ): GetPlanResponse

  @RequestLine("POST /v1/plans/{plan-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun updatePlan(@Param("plan-id") planId: Long, request: UpdatePlanRequest):
      UpdatePlanResponse

  @RequestLine("POST /v1/subscriptions")
  @Headers(value=["Content-Type: application/json"])
  public fun createSubscription(request: CreateSubscriptionRequest): CreateSubscriptionResponse

  @RequestLine("GET /v1/subscriptions/{subscription-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getSubscription(@Param("subscription-id") subscriptionId: Long):
      GetSubscriptionResponse

  @RequestLine("GET /v1/partners/{partner-id}/plans?currency={currency}")
  @Headers(value=["Content-Type: application/json"])
  public fun partnerPlans(@Param("partner-id") partnerId: Long, @Param("currency") currency: String?
      = null): SearchPlanResponse

  @RequestLine("GET /v1/partners/{partner-id}/subscriptions?status={status}&subscriber-id={subscriber-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun partnerSubscriptions(
    @Param("partner-id") partnerId: Long,
    @Param("status") status: String,
    @Param("subscriber-id") subscriberId: Long? = null
  ): SearchSubscriptionResponse

  @RequestLine("GET /v1/partners/{partner-id}/subscriptions/count?status={status}")
  @Headers(value=["Content-Type: application/json"])
  public fun partnerSubscriptionCount(@Param("partner-id") partnerId: Long, @Param("status")
      status: String): CountSubscriptionResponse
}
