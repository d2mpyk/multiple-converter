package com.d2mp.conversor.model;

public class Result {
    private String result;
    private int time_last_update_unix;
    private String time_last_update_utc;
    private int time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private double conversion_rate;

    public Result() {
    }
    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }
    public int getTime_last_update_unix() {
        return time_last_update_unix;
    }
    public String getBase_code() {
        return base_code;
    }
    public String getTarget_code() {
        return target_code;
    }
    public double getConversion_rate() {
        return conversion_rate;
    }
    public Result(ResultRecord resultRecord) {
        this.result = resultRecord.result();
        this.time_last_update_unix = resultRecord.time_last_update_unix();
        this.time_last_update_utc = resultRecord.time_last_update_utc();
        this.time_next_update_unix = resultRecord.time_next_update_unix();
        this.time_next_update_utc = resultRecord.time_next_update_utc();
        this.base_code = resultRecord.base_code();
        this.target_code = resultRecord.target_code();
        this.conversion_rate = resultRecord.conversion_rate();
    }
}
