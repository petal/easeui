package com.hyphenate.easeui.modules.conversation.interfaces

import com.hyphenate.easeui.modules.conversation.model.EaseConversationInfo

/**
 * 会话列表加载数据的监听
 */
interface OnConversationLoadListener {
    fun filterData(origin: MutableList<EaseConversationInfo>?, onFilter: (filter: MutableList<EaseConversationInfo>) -> Unit) {}

    /**
     * 加载完成后回调
     * @param data
     */
    fun loadDataFinish(data: MutableList<EaseConversationInfo?>?)

    /**
     * 加载数据失败后回调
     * @param message
     */
    fun loadDataFail(message: String?) {}
}
