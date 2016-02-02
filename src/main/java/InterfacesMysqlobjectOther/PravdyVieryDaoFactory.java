
package InterfacesMysqlobjectOther;


public enum PravdyVieryDaoFactory {
    
    INSTANCE;
    
    public PravdyVieryDao getPravdyVieryDao(){
        return new MysqlPravdyViery();
    }
    
}
