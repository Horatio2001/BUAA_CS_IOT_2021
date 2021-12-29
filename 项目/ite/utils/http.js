import request from "./request";

const http={
    /**
     * methods: 请求
     * @param url 请求地址
     * @param params 请求参数
     */
    get(url,data){
        return request({
            method:'get',
            url:url,
            crossdomain: true,
            params:data
        })
    },

    post(url,data){
        return request({
            method: 'post',
            url: url,
            crossdomain: true,
            data: data
        })
    }
}

export default http
