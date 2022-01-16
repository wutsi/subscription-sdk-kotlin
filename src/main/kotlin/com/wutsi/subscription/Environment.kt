package com.wutsi.subscription

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-subscription-test.herokuapp.com"),
  PRODUCTION("https://wutsi-subscription-prod.herokuapp.com"),
  ;
}
