import "mdb-vue-ui-kit/css/mdb.min.css";
import 'element-plus/dist/index.css'

import { createApp } from 'vue';
import ElementPlus from 'element-plus'
import App from './App.vue';
import router from "./router";
import { createPinia } from 'pinia';
import piniaPluginPersist from 'pinia-plugin-persist';

const pinia = createPinia()

const app = createApp(App)

pinia.use(piniaPluginPersist)

app.use(ElementPlus)
app.use(router)
app.use(pinia)

app.mount("#app")
