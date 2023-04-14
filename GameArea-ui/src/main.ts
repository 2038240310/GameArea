import { createApp } from 'vue'
import { createPinia } from 'pinia'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'
import router from './router'

import '@/assets/css/reset.css'
// `@unocss/reset` comes with `unocss` so you don't have to install it separately
import '@unocss/reset/tailwind.css'
// Import `@kidonng/daisyui` **BEFORE** `uno.css`
import '@kidonng/daisyui/index.css'
// import 'uno.css'

import './assets/main.css'

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(ElementPlus)

app.mount('#app')
