(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discussxunwuqishi/detail"],{"2d37":function(t,n,e){"use strict";e.d(n,"b",(function(){return a})),e.d(n,"c",(function(){return r})),e.d(n,"a",(function(){return s}));var s={mescrollUni:function(){return Promise.all([e.e("common/vendor"),e.e("components/mescroll-uni/mescroll-uni")]).then(e.bind(null,"b3fe"))},uniPopup:function(){return e.e("components/uni-popup/uni-popup").then(e.bind(null,"79d7"))}},a=function(){var t=this,n=t.$createElement;t._self._c},r=[]},"3e2e":function(t,n,e){"use strict";(function(t){e("64cf");s(e("66fd"));var n=s(e("95ac"));function s(t){return t&&t.__esModule?t:{default:t}}t(n.default)}).call(this,e("543d")["createPage"])},"95ac":function(t,n,e){"use strict";e.r(n);var s=e("2d37"),a=e("fe8f");for(var r in a)"default"!==r&&function(t){e.d(n,t,(function(){return a[t]}))}(r);e("fd7f");var i,u=e("f0c5"),o=Object(u["a"])(a["default"],s["b"],s["c"],!1,null,null,null,!1,s["a"],i);n["default"]=o.exports},ad47:function(t,n,e){"use strict";(function(t){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var s=a(e("a34a"));function a(t){return t&&t.__esModule?t:{default:t}}function r(t,n,e,s,a,r,i){try{var u=t[r](i),o=u.value}catch(c){return void e(c)}u.done?n(o):Promise.resolve(o).then(s,a)}function i(t){return function(){var n=this,e=arguments;return new Promise((function(s,a){var i=t.apply(n,e);function u(t){r(i,s,a,u,o,"next",t)}function o(t){r(i,s,a,u,o,"throw",t)}u(void 0)}))}}var u={data:function(){return{autoplaySwiper:!0,intervalSwiper:5e3,btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:{},sfshIndex:-1,sfshOptions:["通过","不通过"],count:0}},computed:{SecondToDate:function(){var t=this.count;return null!=t&&""!=t&&(t=t>60&&t<3600?parseInt(t/60)+"分钟"+parseInt(60*(parseFloat(t/60)-parseInt(t/60)))+"秒":t>=3600&&t<86400?parseInt(t/3600)+"小时"+parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))+"分钟"+parseInt(60*(parseFloat(60*(parseFloat(t/3600)-parseInt(t/3600)))-parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))))+"秒":t>=86400?parseInt(t/3600/24)+"天"+parseInt(24*(parseFloat(t/3600/24)-parseInt(t/3600/24)))+"小时"+parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))+"分钟"+parseInt(60*(parseFloat(60*(parseFloat(t/3600)-parseInt(t/3600)))-parseInt(60*(parseFloat(t/3600)-parseInt(t/3600)))))+"秒":parseInt(t)+"秒"),t}},onLoad:function(t){var n=this;return i(s.default.mark((function e(){return s.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n.id=t.id;case 1:case"end":return e.stop()}}),e)})))()},onShow:function(n){var e=this;return i(s.default.mark((function n(){var a,r;return s.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return e.init(),a=t.getStorageSync("nowTable"),n.next=4,e.$api.session(a);case 4:r=n.sent,e.user=r.data,e.btnColor=e.btnColor.sort((function(){return.5-Math.random()}));case 7:case"end":return n.stop()}}),n)})))()},destroyed:function(){},methods:{onPayTap:function(){t.setStorageSync("paytable","discussxunwuqishi"),t.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onAcrossTap:function(n){t.setStorageSync("crossTable","discussxunwuqishi"),t.setStorageSync("crossObj",this.detail),this.$utils.jump("../".concat(n,"/add-or-update?cross=true"))},init:function(){var t=this;return i(s.default.mark((function n(){var e;return s.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return n.next=2,t.$api.info("discussxunwuqishi",t.id);case 2:e=n.sent,t.detail=e.data;case 4:case"end":return n.stop()}}),n)})))()},mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(t){var n=this;return i(s.default.mark((function e(){var a;return s.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,n.$api.list("discussdiscussxunwuqishi",{page:t.num,limit:t.size,refid:n.id});case 2:a=e.sent,1==t.num&&(n.commentList=[]),n.commentList=n.commentList.concat(a.data.list),0==a.data.list.length&&(n.hasNext=!1),t.endSuccess(t.size,n.hasNext);case 7:case"end":return e.stop()}}),e)})))()},onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(n){var e=this;t.downloadFile({url:n,success:function(t){200===t.statusCode&&(e.$utils.msg("下载成功"),window.open(n))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){this.$utils.jump("../discussdiscussxunwuqishi/add-or-update?refid=".concat(this.id))},zan:function(){var n=this;return i(s.default.mark((function e(){var a;return s.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:a=n,t.showModal({title:"提示",content:"是否点赞",success:function(){var t=i(s.default.mark((function t(n){return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!n.confirm){t.next=5;break}return a.detail.thumbsupnum=parseInt(a.detail.thumbsupnum)+1,t.next=4,a.$api.update("discussxunwuqishi",a.detail);case 4:a.$utils.msg("点赞成功");case 5:case"end":return t.stop()}}),t)})));function n(n){return t.apply(this,arguments)}return n}()});case 2:case"end":return e.stop()}}),e)})))()},cai:function(){var n=this;return i(s.default.mark((function e(){var a;return s.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:a=n,t.showModal({title:"提示",content:"是否点踩",success:function(){var t=i(s.default.mark((function t(n){return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!n.confirm){t.next=5;break}return a.detail.crazilynum=parseInt(a.detail.crazilynum)+1,t.next=4,a.$api.update("discussxunwuqishi",a.detail);case 4:a.$utils.msg("点踩成功");case 5:case"end":return t.stop()}}),t)})));function n(n){return t.apply(this,arguments)}return n}()});case 2:case"end":return e.stop()}}),e)})))()},onSHTap:function(){this.$refs.popup.open()},onFinishTap:function(){var t=this;return i(s.default.mark((function n(){return s.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(t.detail.sfsh){n.next=3;break}return t.$utils.msg("请选择审核状态"),n.abrupt("return");case 3:if(t.detail.shhf){n.next=6;break}return t.$utils.msg("请填写审核回复"),n.abrupt("return");case 6:return"通过"==t.detail.sfsh&&(t.detail.sfsh="是"),"不通过"==t.detail.sfsh&&(t.detail.sfsh="否"),n.next=10,t.$api.update("discussxunwuqishi",t.detail);case 10:t.$utils.msg("审核成功"),t.$refs.popup.close();case 12:case"end":return n.stop()}}),n)})))()},onCloseWinTap:function(){this.$refs.popup.close()},sfshChange:function(t){console.log(this.detail),this.sfshIndex=t.target.value,this.detail.sfsh=this.sfshOptions[this.sfshIndex]}}};n.default=u}).call(this,e("543d")["default"])},f601:function(t,n,e){},fd7f:function(t,n,e){"use strict";var s=e("f601"),a=e.n(s);a.a},fe8f:function(t,n,e){"use strict";e.r(n);var s=e("ad47"),a=e.n(s);for(var r in s)"default"!==r&&function(t){e.d(n,t,(function(){return s[t]}))}(r);n["default"]=a.a}},[["3e2e","common/runtime","common/vendor"]]]);