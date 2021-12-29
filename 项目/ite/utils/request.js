import axios from "axios";

const service = axios.create({
    baseURL:'http://152.136.111.221:8083/',
    timeout: 4*1000,
})

export default service
