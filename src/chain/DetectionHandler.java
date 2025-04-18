package chain;

import java.util.List;

public abstract class  DetectionHandler {

  protected DetectionHandler nextHandler;

  // 設置下一個處理者
  public void setNextHandler(DetectionHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  // 處理請求的抽象方法
  public abstract void detect(List<Sprite> detectees,int destination);
}
