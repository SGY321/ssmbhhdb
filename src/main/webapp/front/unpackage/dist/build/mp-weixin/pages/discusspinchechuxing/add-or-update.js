(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discusspinchechuxing/add-or-update"],{"02e6":function(e,n,t){"use strict";var r=t("9eb1"),u=t.n(r);u.a},"12c3":function(e,n,t){"use strict";(function(e){t("64cf");r(t("66fd"));var n=r(t("5010"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},"485e":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=u(t("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,r,u,a,i){try{var c=e[a](i),o=c.value}catch(s){return void t(s)}c.done?n(o):Promise.resolve(o).then(r,u)}function i(e){return function(){var n=this,t=arguments;return new Promise((function(r,u){var i=e.apply(n,t);function c(e){a(i,r,u,c,o,"next",e)}function o(e){a(i,r,u,c,o,"throw",e)}c(void 0)}))}}var c=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("5811"))}.bind(null,t)).catch(t.oe)},o={data:function(){return{ruleForm:{refid:"",userid:"",nickname:"",content:"",reply:""},user:{},ro:{refid:!1,userid:!1,nickname:!1,content:!1,reply:!1}}},components:{wPicker:c},computed:{},onLoad:function(n){var t=this;return i(r.default.mark((function u(){var a,i,c,o;return r.default.wrap((function(u){while(1)switch(u.prev=u.next){case 0:return a=e.getStorageSync("nowTable"),u.next=3,t.$api.session(a);case 3:if(i=u.sent,t.user=i.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){u.next=13;break}return t.ruleForm.id=n.id,u.next=11,t.$api.info("discusspinchechuxing",t.ruleForm.id);case 11:i=u.sent,t.ruleForm=i.data;case 13:if(!n.cross){u.next=40;break}c=e.getStorageSync("crossObj"),u.t0=r.default.keys(c);case 16:if((u.t1=u.t0()).done){u.next=40;break}if(o=u.t1.value,"refid"!=o){u.next=22;break}return t.ruleForm.refid=c[o],t.ro.refid=!0,u.abrupt("continue",16);case 22:if("userid"!=o){u.next=26;break}return t.ruleForm.userid=c[o],t.ro.userid=!0,u.abrupt("continue",16);case 26:if("nickname"!=o){u.next=30;break}return t.ruleForm.nickname=c[o],t.ro.nickname=!0,u.abrupt("continue",16);case 30:if("content"!=o){u.next=34;break}return t.ruleForm.content=c[o],t.ro.content=!0,u.abrupt("continue",16);case 34:if("reply"!=o){u.next=38;break}return t.ruleForm.reply=c[o],t.ro.reply=!0,u.abrupt("continue",16);case 38:u.next=16;break;case 40:t.styleChange();case 41:case"end":return u.stop()}}),u)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return i(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.refid){n.next=3;break}return e.$utils.msg("关联表id不能为空"),n.abrupt("return");case 3:if(e.ruleForm.userid){n.next=6;break}return e.$utils.msg("用户id不能为空"),n.abrupt("return");case 6:if(e.ruleForm.content){n.next=9;break}return e.$utils.msg("评论内容不能为空"),n.abrupt("return");case 9:if(!e.ruleForm.id){n.next=14;break}return n.next=12,e.$api.update("discusspinchechuxing",e.ruleForm);case 12:n.next=16;break;case 14:return n.next=16,e.$api.add("discusspinchechuxing",e.ruleForm);case 16:e.$utils.msgBack("提交成功");case 17:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,u=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,u=u>9?u:"0"+u,"".concat(t,"-").concat(r,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};n.default=o}).call(this,t("543d")["default"])},5010:function(e,n,t){"use strict";t.r(n);var r=t("ce1c"),u=t("8b9b");for(var a in u)"default"!==a&&function(e){t.d(n,e,(function(){return u[e]}))}(a);t("02e6");var i,c=t("f0c5"),o=Object(c["a"])(u["default"],r["b"],r["c"],!1,null,"d7b9bbb6",null,!1,r["a"],i);n["default"]=o.exports},"8b9b":function(e,n,t){"use strict";t.r(n);var r=t("485e"),u=t.n(r);for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);n["default"]=u.a},"9eb1":function(e,n,t){},ce1c:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return u})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return r}));var u=function(){var e=this,n=e.$createElement;e._self._c},a=[]}},[["12c3","common/runtime","common/vendor"]]]);