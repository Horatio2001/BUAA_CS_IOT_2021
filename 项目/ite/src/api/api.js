import http from "../../utils/http";

export function get_t() {
    return http.get("/getTemperature", null)
}

export function get_h() {
    return http.get("/getHumidity", null)
}

export function close_motor() {
    return http.post("/closeMotor", null)
}

export function open_motor() {
    return http.post("/openMotor", null)
}

export function get_h_list() {
    return http.post("/getHumList", null)
}

export function get_t_list() {
    return http.post("/getTemList", null)
}

export function update_h() {
    return http.post("/updateHumidity", null)
}

export function update_t() {
    return http.post("/updateTemperature", null)
}