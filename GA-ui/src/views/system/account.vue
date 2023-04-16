<template>
    <div>
        <MDBCardGroup style="width: 80%;display: block;">
            <MDBCard class="mb-5">
                <MDBInput label="账号名" v-model="operateData.pub.username" />
            </MDBCard>
            <MDBCard class="mb-5">
                <MDBInput label="昵称" v-model="operateData.pub.nickname" />
            </MDBCard>

            <hr />

            <MDBCardTitle class="mb-2">账号关联</MDBCardTitle>
            <MDBCard class="mb-5">
                <MDBInput label="绑定邮箱" type="email" v-model="operateData.email" readonly />
            </MDBCard>
            <MDBCard class="mb-5">
                <MDBInput label="绑定手机" v-model="operateData.phone" readonly />
            </MDBCard>

            <hr />

            <MDBCardTitle class="mb-2">修改密码</MDBCardTitle>
            <MDBCard class="mb-5">
                <MDBInput label="新密码" type="password" v-model="operateData.pri.fir_password" />
            </MDBCard>
            <MDBCard class="mb-5">
                <MDBInput label="输入第二次" type="password" v-model="operateData.pri.sec_password" />
            </MDBCard>

            <MDBBtn @click="pwdCancel">取消</MDBBtn>
            <MDBBtn color="primary" @click="pwdReset">修改密码</MDBBtn>


        </MDBCardGroup>
    </div>
</template>

<script setup lang="ts">
import { MDBBtn, MDBBtnGroup, MDBCard, MDBCardGroup, MDBCardTitle, MDBInput } from 'mdb-vue-ui-kit';
import { reactive } from 'vue';

let operateData = reactive<any>({})

// 静态数据
operateData ={
    pub: {
        username: 'wws',
        nickname: 'wws_father',
        email: '',
        phone: '',
    },
    pri: {
        password: '',
        fir_password: '',
        sec_password: ''
    }
}

function pwdCancel() {
    console.log(operateData.pri.fir_password+ ' ' +operateData.pri.sec_password);
    operateData.pri.fir_password = ''
    operateData.pri.sec_password = ''
    console.log(operateData.pri.fir_password+ ' ' +operateData.pri.sec_password);
    // 重新渲染
}

function pwdReset() {
    // 二次密码比对
    if(operateData.pri.fir_password != operateData.pri.sec_password){
        // 二次密码不同错误显示
        return
    }
    //修改发送
    console.log(operateData.pri.fir_password+ ' ' +operateData.pri.sec_password);
}

</script>

<style scoped></style>