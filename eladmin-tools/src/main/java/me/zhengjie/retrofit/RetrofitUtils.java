package me.zhengjie.retrofit;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;

public class RetrofitUtils {
    public static String privateKey="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCWhQXgaq69OB7gUaoXeX/HmbK1Tz6YmMMYvbsg64TVn5ljKOtNpHY8KQsUl5h1bNF02brQdNJqsO/hViVDO4fw15EbV9h01F1GNoA1KznNaQT0KxJGiGI4yfU668V7/IaN0INEJJVT6zEmHxmvAma/tvM6f8HHtGDjnxA9p8XXNwrByFg93Qb6NitVDZGg2UrS/3jVK+dzntjGfKLVnQbs4nTBe/tDJHxoyKkXl2iwlR1jjdAr7djVpz6/13bF/PMWAhn4gcONJ4udGgdcM07PWrJiLQ8RyhzLwm/lxsvGJZEXl0abd80I1N5IuV6S5Wt55juPvL5RIYbReTvj4xTrAgMBAAECggEAXMMMNRrqJ5jfhnUtsxvgwN0bApwcwqRaj/PV0Fr1WUXrnO3J3ea+KyNMPduTTMLMbwwEEpX8W15B54hUnJOimq3vMn+32YBLH4tVBe9mxw2yzNuCfs9sYP0t0asd4ORm9B0N2MAG+1nVx12hUXbUZdBVI7c6cF3c3EraEnVD+vZxOtbfCC/awrYl3RdZI8yjlU7vEcFl9O/p8wFs51empacwd7GH+pwSJ/ObIWFr9Z+KOhLLrjUJ/5JgVqFpWh7AopIiYXVglGquDCmCjGYlNHSArS8VrXA/oDGqQQkIvSX05zlgq+6Ah8BopQflERqNxIN+apEdEOzaqVULdGOjcQKBgQDVBL+LpqDceThOgl31iX0+SQGW6VgPfC572ccpqll4TR6vSSDCYLh6cy2h3hH7PB5UoEpi+l7nZRPLEGqVK0venA2IxFKJkqtxMbB+23h1VboNAPpCjcjdoyOngLB8oJY9oGjHvv9AKYwQusUcwwOeZmhAosbjhfo+1nh/0c+KYwKBgQC04/UlDgxcyfC+sFzHUWN+fymbw4z1DRkQw2/8iHDLR762bHJSPkvNzqbKrKdsoxK4tCvuilxN/rR5rmmq9tgu0QoeMMhFswshta59dKah9b9ECyGhEBiDsUrdzSlDJaTqBpqviBF11KYlPJDw0gu66pOLMVDzrx6P7Q9yhH1N2QKBgHiy3g209oS2Ms9ZUv/jTZHTMBFgWkM76+LFPPJA0b02hWJwnx1ETIMla//BopKmN9FfmYaHsuqN/S8cOCgZhj22UnziMJo+/uF+dDENDi39yxO/MA4x5FShMXyhkF6tZzO4BmbXtC2Y3QJFsZZgcVZ5VCz7jpIwweCFCXXzXhNdAoGAXb610RpStdPB/FESBAnd8jScr6jMaEL9dn6SjuF28yKfZ5MUPCMkzegG8IpByj9I+IgHLHxwEcuqZFVLVdrPdpPHFpZZdCWx4ypw33uQz+a31N+f8gSRb8516jTk6XOc39vEVqvBwLsPz8RvqR5yDdB73msUdPWQdS56DvMyrSECgYAJmuohCn2Iv6nWSxw5UykAfsTvIBcSa7HUh3HZ7iJ2EfavSTmHmsBmWfMOoXcXpKnPm4ttGiOtKE5BCNvtFl3CgWmveBwtquHQBGyKXqj+g5IPSk1cvIt1VnPYRvko+SY2LdWLZU2ktTIOziwZTrGbYIReghJ8q56akEc2SYRjXg==";
    public static String alipayPublicKey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmD9v6PmW3urTgRluYbiQytdZGeX4H8DmNcmyZPLYf8jBg2OsVy/AgPc0QyV6IfvU+mK4Nbg9n0SVdxtWDMCysefs8HfORaweUaPBg94uaAVXnG/g8jwjRGFwy+REFxd5/+Yd7fm7Jm8Bh5F3lidWfUSfUxiAE+ySa1SwGkDLopAKXtDHefrQcVdraCUH3daaFBTCepfh2myG4HOq+ZC4doaXD/WEnchKtCxuitWU+A4+vmcUZsIPgidvLFxXjJje+dP3sLOkPitq5uvYkywlWlhwpkEpRYgi7Y218vKZmGyNEY6OdZbPMGHL/f5XOshfumPqBTHCYMtZgJCWF2HlkwIDAQAB";
    public static String appId="2021002125611503";
    public static void main(String[] args) throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
                appId,
                privateKey,
                "json",
                "GBK",
                alipayPublicKey,
                "RSA2");
        AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
        request.setBizContent("{" +
                "\"bill_type\":\"trade\"," +
                "\"bill_date\":\"2016-04-05\"" +
                "  }");
        AlipayDataDataserviceBillDownloadurlQueryResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
            System.out.println(""+response.getBillDownloadUrl());
        } else {
            System.out.println(""+response.getMsg());
            System.out.println(""+response.getCode());
            System.out.println(""+response.getBody());
            System.out.println("调用失败");
        }
    }
}
