import "mdb-vue-ui-kit/css/mdb.min.css";
import 'element-plus/dist/index.css'

import { createApp } from "vue";
import "./style.css";
import ElementPlus from 'element-plus'
import App from "./App.vue";
import router from "./router";

const app = createApp(App)

app.use(ElementPlus)
app.use(router)

app.mount("#app")
