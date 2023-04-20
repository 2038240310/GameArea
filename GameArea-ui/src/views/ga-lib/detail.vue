<template>
    <div>
        <!-- 帖子主栏目 -->
        <MDBCard class="mb-3">

            <!-- <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                <MDBCol md="8" style="width: 80%; background-color: rgba(0, 255, 0, 0.3);">
                    <MDBCardBody>
                        <MDBCardTitle>该栏目标题</MDBCardTitle>
                        <MDBCardText>
                            <small class="text-muted">createTime</small>
                        </MDBCardText>
                    </MDBCardBody>
                </MDBCol>
                <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
                    <MDBCardImg fluid src="" alt="...">头像</MDBCardImg>
                    <div>发帖人信息</div>
                </MDBCol>

            </MDBRow> -->
            <MDBRow>
                <!-- 主要信息 -->
                <MDBCol>
                    <MDBCard>
                        <MDBCardTitle>
                            {{ route.query.id }}
                        </MDBCardTitle>
                        <!-- <MDBCardText>
                            帖子内容-长文章
                        </MDBCardText> -->
                        <MDBRow>
                            <MDBCol col="8">
                                <MDBCardTitle>
                                    <b>远古织影者</b>
                                </MDBCardTitle>
                                <MDBCardText style="font-size: 18px;width: 90%;display: inline-block;">
                                    远古织影者（Ancient Fuelweaver）是饥荒：联机版的一类Boss级生物，他是一个来自远古文明的存在。

                                    远古织影者由玩家在中庭用远古钥匙激活远古大门，并在大门范围内复活奇异的骨架后生成，他会试图杀死玩家然后关闭远古大门。复活远古织影者会消耗玩家40San。

                                    当他被击杀后，会返还8个化石碎片，并掉落2-4个噩梦燃料，暗影香炉，骨头头盔，骨头盔甲，还有远古织影者草图，同时会有一朵玫瑰留在他被击杀的位置。
                                    随着他的溃败，远古大门会进入失稳状态约4分钟，让玩家有时间打扫战场和撤出中庭。这段时间内，大门附近生成的暗影生物都会瞬间消散。接着大门将在剧烈闪烁后归于平静，整个遗迹区域的建筑，战利品箱内容物，生物，以及某些结构会被完全重置。在默认世界设置的情况下，远古大门需要冷却20天才能再次用来召唤远古织影者。
                                    若玩家在和织影者的战斗中撤退或是被杀，织影者会走向远古大门并拔出远古钥匙，然后他会散架，返还暗影心房和8个化石碎片。
                                    除了激活后的远古大门附近，玩家无法在中庭的其他区域复活奇异的骨架。
                                    远古织影者免疫燃烧和冰冻。
                                </MDBCardText>
                            </MDBCol>
                            <MDBCol col="4">
                                <MDBCard border="message">
                                    <MDBCardImg
                                        src="http://localhost:8080/img/lib/test/800px-Reanimated_Skeleton_Atrium.png" style="width: 100%;"/>
                                    <MDBCard border="message">
                                        <tbody>
                                            <tr>
                                                <th scope="row" class="infobox-label"
                                                    style="width:90px;border-bottom:1px solid #634931;">生命值</th>
                                                <td class="infobox-data"
                                                    style="border-bottom:1px solid #634931;text-align:left;;">
                                                    16000</td>
                                            </tr>
                                            <tr>
                                                <th scope="row" class="infobox-label"
                                                    style="width:90px;border-bottom:1px solid #634931;">伤害</th>
                                                <td class="infobox-data"
                                                    style="border-bottom:1px solid #634931;text-align:left;;">
                                                    200（对玩家减半）</td>
                                            </tr>
                                            <tr>
                                                <td colspan="2"
                                                    style="text-align:center;border-bottom:1px solid #634931;text-align:left;;">
                                                    <div class="infobox-half">
                                                        <div class="infobox-half-label">攻击间隔</div>
                                                        <div class="infobox-half-data">3</div>
                                                    </div>
                                                    <div class="infobox-half">
                                                        <div class="infobox-half-label"><span
                                                                title="单位为墙点，即情况下紧靠放置墙壁的间隔，也是地块边长的四分之一。"
                                                                style="cursor:help">攻击范围</span></div>
                                                        <div class="infobox-half-data">2.4</div>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th scope="row" class="infobox-label"
                                                    style="width:90px;border-bottom:1px solid #634931;">移动速度</th>
                                                <td class="infobox-data"
                                                    style="border-bottom:1px solid #634931;text-align:left;;">
                                                    4.2</td>
                                            </tr>
                                            <tr>
                                                <th scope="row" class="infobox-label"
                                                    style="width:90px;border-bottom:1px solid #634931;">特性</th>
                                                <td class="infobox-data"
                                                    style="border-bottom:1px solid #634931;text-align:left;;">
                                                    恐吓生物,制造骨钉,大声讲话,吸收 编织暗影 回血,护盾,精神控制,关闭远古大门.
                                                </td>
                                            </tr>
                                        </tbody>
                                    </MDBCard>
                                </MDBCard>
                            </MDBCol>
                        </MDBRow>
                    </MDBCard>
                    <MDBCard>
                        <!-- 分享文件栏目功能交互 -->
                        以上资料来自 <a href="https://dontstarve.huijiwiki.com/wiki/%E5%A4%8D%E6%B4%BB%E7%9A%84%E9%AA%A8%E6%9E%B6">灰机wiki-饥荒wiki</a>
                    </MDBCard>
                </MDBCol>
            </MDBRow>
        </MDBCard>
        <!-- 回复列表 -->
        <!-- <MDBCard style="width: 80%;">
            <div v-for="item in replyList.list">
                <MDBCard class="mb-3">
                    <MDBRow class="g-0" style="display: flex; flex-wrap: nowrap;">
                        <MDBCol md="2" style="background-color: rgba(255, 0, 0, 0.3);">
                            <MDBCardImg fluid src="" alt="..." />
                            <MDBCardText>{{ item.userId }}</MDBCardText>
                        </MDBCol>
                        <MDBCol md="8" style="width: 80%; ">
                            <MDBCardBody>
                                <MDBCardText>
                                    {{ item.message }}
                                </MDBCardText>
                            </MDBCardBody>
                        </MDBCol>
                    </MDBRow>
                </MDBCard>
            </div> -->
        <!-- 发送回复 -->
        <!-- <div>
                <MDBTextarea label="回复" type="text" />
            </div>
            <MDBBtnGroup>
                <MDBBtn color="primary">发送</MDBBtn>
            </MDBBtnGroup>
        </MDBCard> -->


    </div>
</template>

<script setup lang="ts">
import { MDBAccordion, MDBAccordionItem, MDBRow, MDBCol, MDBCard, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardImg, MDBTextarea, MDBBtnGroup, MDBBtn } from "mdb-vue-ui-kit";
import { reactive } from "vue";
import { useRoute } from 'vue-router'

const route = useRoute()

// 回复列表
const replyList = reactive<any>({
    list: []
})

// 静态信息
replyList.list = [
    {
        userId: '1',
        message: '你好',
    },
    {
        userId: '2',
        message: '欢迎',
    },
]

</script>

<style scoped></style>