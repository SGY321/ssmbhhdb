<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">标题</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.biaoti" v-model="ruleForm.biaoti" placeholder="标题"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">物品名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.wupinmingcheng" v-model="ruleForm.wupinmingcheng" placeholder="物品名称"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">交易类型</view>
				<picker @change="jiaoyileixingChange" :value="jiaoyileixingIndex" :range="jiaoyileixingOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.jiaoyileixing?ruleForm.jiaoyileixing:"请选择交易类型"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiage" v-model="ruleForm.jiage" placeholder="价格"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="fujianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">附件</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-if="ruleForm.fujian"  v-model="ruleForm.fujian" placeholder="附件"></input>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.tupian" :src="ruleForm.tupian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">发布时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.fabushijian" placeholder="发布时间" @tap="toggleTab('fabushijian')"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">联系人</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.lianxiren" v-model="ruleForm.lianxiren" placeholder="联系人"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">联系方式</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.lianxifangshi" v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
																		
			<!-- 否 -->
 
			
			          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(204, 204, 204, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">交易详情</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.jiaoyixiangqing" placeholder="交易详情"></textarea>
			</view>
						          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(72, 60, 208, 1)","borderColor":"rgba(147, 193, 7, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="fabushijianConfirm" ref="fabushijian" themeColor="#333333"></w-picker>
																<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="clicktimeConfirm" ref="clicktime" themeColor="#333333"></w-picker>
							
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												biaoti: '',
																wupinmingcheng: '',
																jiaoyixiangqing: '',
																jiaoyileixing: '',
																jiage: '',
																fujian: '',
																tupian: '',
																fabushijian: '',
																lianxiren: '',
																lianxifangshi: '',
																clicktime: '',
												},
																																				jiaoyileixingOptions: [],
				jiaoyileixingIndex: 0,
																																																																				// 登陆用户信息
				user: {},
                                ro:{
                                   biaoti : false,
                                   wupinmingcheng : false,
                                   jiaoyixiangqing : false,
                                   jiaoyileixing : false,
                                   jiage : false,
                                   fujian : false,
                                   tupian : false,
                                   fabushijian : false,
                                   lianxiren : false,
                                   lianxifangshi : false,
                                   clicktime : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
        		this.ruleForm.fabushijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																																								
																														// 下拉框
			res = await this.$api.option(`jiaoyileixing`,`jiaoyileixing`,{});
			this.jiaoyileixingOptions = res.data;
																																																			
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`ershoujiaoyi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='biaoti'){
					this.ruleForm.biaoti = obj[o];
					this.ro.biaoti = true;
					continue;
					}
					if(o=='wupinmingcheng'){
					this.ruleForm.wupinmingcheng = obj[o];
					this.ro.wupinmingcheng = true;
					continue;
					}
					if(o=='jiaoyixiangqing'){
					this.ruleForm.jiaoyixiangqing = obj[o];
					this.ro.jiaoyixiangqing = true;
					continue;
					}
					if(o=='jiaoyileixing'){
					this.ruleForm.jiaoyileixing = obj[o];
					this.ro.jiaoyileixing = true;
					continue;
					}
					if(o=='jiage'){
					this.ruleForm.jiage = obj[o];
					this.ro.jiage = true;
					continue;
					}
					if(o=='fujian'){
					this.ruleForm.fujian = obj[o];
					this.ro.fujian = true;
					continue;
					}
					if(o=='tupian'){
					this.ruleForm.tupian = obj[o];
					this.ro.tupian = true;
					continue;
					}
					if(o=='fabushijian'){
					this.ruleForm.fabushijian = obj[o];
					this.ro.fabushijian = true;
					continue;
					}
					if(o=='lianxiren'){
					this.ruleForm.lianxiren = obj[o];
					this.ro.lianxiren = true;
					continue;
					}
					if(o=='lianxifangshi'){
					this.ruleForm.lianxifangshi = obj[o];
					this.ro.lianxifangshi = true;
					continue;
					}
					if(o=='clicktime'){
					this.ruleForm.clicktime = obj[o];
					this.ro.clicktime = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																								
			// 多级联动参数
																																																																								
																																																																					
																																																			// 日长控件选择日期时间
			fabushijianConfirm(val) {
				console.log(val)
				this.ruleForm.fabushijian = val.result;
				this.$forceUpdate();
			},
																								// 日长控件选择日期时间
			clicktimeConfirm(val) {
				console.log(val)
				this.ruleForm.clicktime = val.result;
				this.$forceUpdate();
			},
						
																											// 下拉变化
			jiaoyileixingChange(e) {
				this.jiaoyileixingIndex = e.target.value
				this.ruleForm.jiaoyileixing = this.jiaoyileixingOptions[this.jiaoyileixingIndex]
			},
																																																
																																																						fujianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fujian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
															tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																													
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												if(this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
																																																												if(this.ruleForm.id){
					await this.$api.update(`ershoujiaoyi`, this.ruleForm);
				}else{
					await this.$api.add(`ershoujiaoyi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
