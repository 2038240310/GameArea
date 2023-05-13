<template>
    <div>
        <div class="h3 flex m-3">本分区规则</div>
        <br>
        <div class="w-11/12 mx-auto bg-base-100">
            {{ ruleText.text }}
        </div>
    </div>
</template>

<script setup lang="ts">
import { onMounted, reactive } from 'vue';


const ruleText = reactive({
    text: ""
})

onMounted(() => {
    ruleText.text = "\t欢迎来到游戏论坛平台，这里是游戏爱好者交流分享的地方。为了营造一个良好的网络环境，我们制定了以下的平台礼仪规则，请大家遵守：\n尊重他人，不要发表任何侮辱、歧视、挑衅、诽谤、骚扰、威胁或违法的言论。\n保持文明，不要使用任何粗俗、低俗、暴力、色情或不雅的语言或图片。\n遵守版规，不要在错误的版块发帖或回复，不要发布与主题无关或重复的内容，不要恶意灌水或刷屏。\n尊重版权，不要转载或分享任何未经授权或侵犯他人知识产权的内容，如有引用，请注明出处。\n爱护平台，不要利用平台进行任何商业活动或广告推广，不要散布任何虚假或有害的信息，不要破坏平台的正常运行。\n我们希望大家能够遵守这些规则，共同维护一个和谐友善的游戏论坛平台。如果您发现有任何违反规则的行为，请及时举报或联系管理员。感谢您的理解与支持！"
})


</script>

<style scoped>

</style>