package dp.hf.observerPattern.subject;

import dp.hf.observerPattern.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);// 구독 추가
    public void removeObserver(Observer o);// 구독 삭제
    public void notifyObservers();// Subject 객체의 상태 변경시 이를 모든 옵저버에게 알림
}
