import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussbiaobaiguangchang from '@/views/modules/discussbiaobaiguangchang/list'
    import xunwuqishi from '@/views/modules/xunwuqishi/list'
    import pinchechuxing from '@/views/modules/pinchechuxing/list'
    import discusstucaodahui from '@/views/modules/discusstucaodahui/list'
    import storeup from '@/views/modules/storeup/list'
    import discussershoujiaoyi from '@/views/modules/discussershoujiaoyi/list'
    import ershoujiaoyi from '@/views/modules/ershoujiaoyi/list'
    import shiwuzhaoling from '@/views/modules/shiwuzhaoling/list'
    import wupinfenlei from '@/views/modules/wupinfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussxunwuqishi from '@/views/modules/discussxunwuqishi/list'
    import jiaoyileixing from '@/views/modules/jiaoyileixing/list'
    import chat from '@/views/modules/chat/list'
    import discusspinchechuxing from '@/views/modules/discusspinchechuxing/list'
    import tucaodahui from '@/views/modules/tucaodahui/list'
    import biaobaiguangchang from '@/views/modules/biaobaiguangchang/list'
    import config from '@/views/modules/config/list'
    import discussshiwuzhaoling from '@/views/modules/discussshiwuzhaoling/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussbiaobaiguangchang',
        name: '表白广场评论',
        component: discussbiaobaiguangchang
      }
      ,{
	path: '/xunwuqishi',
        name: '寻物启事',
        component: xunwuqishi
      }
      ,{
	path: '/pinchechuxing',
        name: '拼车出行',
        component: pinchechuxing
      }
      ,{
	path: '/discusstucaodahui',
        name: '吐槽大会评论',
        component: discusstucaodahui
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discussershoujiaoyi',
        name: '二手交易评论',
        component: discussershoujiaoyi
      }
      ,{
	path: '/ershoujiaoyi',
        name: '二手交易',
        component: ershoujiaoyi
      }
      ,{
	path: '/shiwuzhaoling',
        name: '失物招领',
        component: shiwuzhaoling
      }
      ,{
	path: '/wupinfenlei',
        name: '物品分类',
        component: wupinfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussxunwuqishi',
        name: '寻物启事评论',
        component: discussxunwuqishi
      }
      ,{
	path: '/jiaoyileixing',
        name: '交易类型',
        component: jiaoyileixing
      }
      ,{
	path: '/chat',
        name: '客服中心',
        component: chat
      }
      ,{
	path: '/discusspinchechuxing',
        name: '拼车出行评论',
        component: discusspinchechuxing
      }
      ,{
	path: '/tucaodahui',
        name: '吐槽大会',
        component: tucaodahui
      }
      ,{
	path: '/biaobaiguangchang',
        name: '表白广场',
        component: biaobaiguangchang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussshiwuzhaoling',
        name: '失物招领评论',
        component: discussshiwuzhaoling
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
