(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/index/index"],{"59b6":function(n,t,i){"use strict";var e=i("7a66"),a=i.n(e);a.a},"6d63":function(n,t,i){"use strict";var e;i.d(t,"b",(function(){return a})),i.d(t,"c",(function(){return u})),i.d(t,"a",(function(){return e}));var a=function(){var n=this,t=n.$createElement,i=(n._self._c,n.__map(n.xunwuqishilist,(function(t,i){var e=n.__get_orig(t),a=t.wupintupian?t.wupintupian.split(","):null;return{$orig:e,g0:a}}))),e=null,a=n.__map(n.shiwuzhaolinglist,(function(t,i){var e=n.__get_orig(t),a=t.tupian?t.tupian.split(","):null;return{$orig:e,g2:a}})),u=null,r=n.__map(n.biaobaiguangchanglist,(function(t,i){var e=n.__get_orig(t),a=t.tupian?t.tupian.split(","):null;return{$orig:e,g4:a}})),o=null,l=n.__map(n.tucaodahuilist,(function(t,i){var e=n.__get_orig(t),a=t.tupian?t.tupian.split(","):null;return{$orig:e,g6:a}})),c=null,s=n.__map(n.ershoujiaoyilist,(function(t,i){var e=n.__get_orig(t),a=t.tupian?t.tupian.split(","):null;return{$orig:e,g8:a}})),f=null,p=n.__map(n.pinchechuxinglist,(function(t,i){var e=n.__get_orig(t),a=t.tupian?t.tupian.split(","):null;return{$orig:e,g10:a}})),d=null;n.$mp.data=Object.assign({},{$root:{l0:i,l1:e,l2:a,l3:u,l4:r,l5:o,l6:l,l7:c,l8:s,l9:f,l10:p,l11:d}})},u=[]},"7a66":function(n,t,i){},"8aff":function(n,t,i){"use strict";(function(n){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var e=a(i("a34a"));function a(n){return n&&n.__esModule?n:{default:n}}function u(n,t){var i;if("undefined"===typeof Symbol||null==n[Symbol.iterator]){if(Array.isArray(n)||(i=r(n))||t&&n&&"number"===typeof n.length){i&&(n=i);var e=0,a=function(){};return{s:a,n:function(){return e>=n.length?{done:!0}:{done:!1,value:n[e++]}},e:function(n){throw n},f:a}}throw new TypeError("Invalid attempt to iterate non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}var u,o=!0,l=!1;return{s:function(){i=n[Symbol.iterator]()},n:function(){var n=i.next();return o=n.done,n},e:function(n){l=!0,u=n},f:function(){try{o||null==i.return||i.return()}finally{if(l)throw u}}}}function r(n,t){if(n){if("string"===typeof n)return o(n,t);var i=Object.prototype.toString.call(n).slice(8,-1);return"Object"===i&&n.constructor&&(i=n.constructor.name),"Map"===i||"Set"===i?Array.from(n):"Arguments"===i||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(i)?o(n,t):void 0}}function o(n,t){(null==t||t>n.length)&&(t=n.length);for(var i=0,e=new Array(t);i<t;i++)e[i]=n[i];return e}function l(n,t,i,e,a,u,r){try{var o=n[u](r),l=o.value}catch(c){return void i(c)}o.done?t(l):Promise.resolve(l).then(e,a)}function c(n){return function(){var t=this,i=arguments;return new Promise((function(e,a){var u=n.apply(t,i);function r(n){l(u,e,a,r,o,"next",n)}function o(n){l(u,e,a,r,o,"throw",n)}r(void 0)}))}}i("6d98");var s=function(){Promise.all([i.e("common/vendor"),i.e("components/uni-ui/lib/uni-icons/uni-icons")]).then(function(){return resolve(i("f7a2"))}.bind(null,i)).catch(i.oe)},f={components:{uniIcons:s},data:function(){return{autoplaySwiper:!0,intervalSwiper:5e3,swiperList:[],xunwuqishilist:[],shiwuzhaolinglist:[],biaobaiguangchanglist:[],tucaodahuilist:[],ershoujiaoyilist:[],pinchechuxinglist:[],news:[]}},onShow:function(){var n=this;return c(e.default.mark((function t(){var i,a,r,o,l;return e.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return i=[],t.next=3,n.$api.page("config",{page:1,limit:5});case 3:a=t.sent,r=u(a.data.list);try{for(r.s();!(o=r.n()).done;)l=o.value,l.name.indexOf("picture")>=0&&l.value&&""!=l.value&&null!=l.value&&i.push({img:l.value})}catch(e){r.e(e)}finally{r.f()}return i&&(n.swiperList=i),t.next=9,n.$api.recommend("xunwuqishi",1,4);case 9:return a=t.sent,n.xunwuqishilist=a.data.list,t.next=13,n.$api.recommend("shiwuzhaoling",1,4);case 13:return a=t.sent,n.shiwuzhaolinglist=a.data.list,t.next=17,n.$api.recommend("biaobaiguangchang",1,4);case 17:return a=t.sent,n.biaobaiguangchanglist=a.data.list,t.next=21,n.$api.recommend("tucaodahui",1,4);case 21:return a=t.sent,n.tucaodahuilist=a.data.list,t.next=25,n.$api.recommend("ershoujiaoyi",1,4);case 25:return a=t.sent,n.ershoujiaoyilist=a.data.list,t.next=29,n.$api.recommend("pinchechuxing",1,4);case 29:a=t.sent,n.pinchechuxinglist=a.data.list;case 31:case"end":return t.stop()}}),t)})))()},methods:{onSwiperTap:function(n){},onNewsDetailTap:function(n){this.$utils.jump("../news-detail/news-detail?id=".concat(n))},onDetailTap:function(n,t){this.$utils.jump("../".concat(n,"/detail?id=").concat(t))},onPageTap:function(t){n.navigateTo({url:"../".concat(t,"/list"),fail:function(){n.switchTab({url:"../".concat(t,"/list")})}})}}};t.default=f}).call(this,i("543d")["default"])},ac22:function(n,t,i){"use strict";i.r(t);var e=i("8aff"),a=i.n(e);for(var u in e)"default"!==u&&function(n){i.d(t,n,(function(){return e[n]}))}(u);t["default"]=a.a},d877:function(n,t,i){"use strict";(function(n){i("64cf");e(i("66fd"));var t=e(i("e55a"));function e(n){return n&&n.__esModule?n:{default:n}}n(t.default)}).call(this,i("543d")["createPage"])},e55a:function(n,t,i){"use strict";i.r(t);var e=i("6d63"),a=i("ac22");for(var u in a)"default"!==u&&function(n){i.d(t,n,(function(){return a[n]}))}(u);i("59b6");var r,o=i("f0c5"),l=Object(o["a"])(a["default"],e["b"],e["c"],!1,null,null,null,!1,e["a"],r);t["default"]=l.exports}},[["d877","common/runtime","common/vendor"]]]);