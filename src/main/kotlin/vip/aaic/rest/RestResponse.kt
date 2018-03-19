package vip.aaic.rest

data class RestResponse<out T>(val code: String = "000", val desc: String = "", val data: T? = null) {
    companion object {
        @JvmField
        val OK: RestResponse<Any> = RestResponse()

        @JvmStatic
        fun <T> of(data: T): RestResponse<T> {
            return RestResponse(data = data)
        }
    }
}