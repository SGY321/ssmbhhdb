const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmbhhdb/",
            name: "ssmbhhdb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmbhhdb/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的校园生活小助手"
        } 
    }
}
export default base
