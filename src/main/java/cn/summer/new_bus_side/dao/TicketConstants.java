package cn.summer.new_bus_side.dao;

public final  class TicketConstants {
    private TicketConstants() {
        throw new IllegalStateException("Illegal access");
    }
    public static  final String TABLE_NAME = "login_ticket";
    public static  final String INSERT_FIELDS = " user_id, expired, status, ticket ";
    public static  final String SELECT_FIELDS = " id, " + INSERT_FIELDS;
}
