package com.xzy.responsibility.chain.pattern;

/**
 * IP解析
 *
 * @author xzy
 * @date 2023/8/12 22:44
 */
public interface IpResolveHandler {

    IpInfo handle(String ip);

    class IpInfo {
        private String ip;
        private String country;
        private String city;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
