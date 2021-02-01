package pattern;

public enum TrafficLight {

    Red(80) {
        @Override
        public void invokeCurrentLight() {
            System.out.println("当前交通信号灯为：" + this.name() + "，将持续时间：" + this.getSeconds() + "毫秒");
            try {
                Thread.sleep(this.getSeconds());
            } catch (InterruptedException e) {
            }
            System.out.println("已切换到下一个灯：" + TrafficLight.Green);
        }
    },

    Green(40) {
        @Override
        public void invokeCurrentLight() {
            System.out.println("当前交通信号灯为：" + this.name() + "，将持续时间：" + this.getSeconds() + "毫秒");
            try {
                Thread.sleep(this.getSeconds());
            } catch (InterruptedException e) {
            }
            System.out.println("已切换到下一个灯：" + TrafficLight.Green);
        }
    };

    private int seconds;

    private TrafficLight(int seconds) {
        this.seconds = seconds;
    }
    public int getSeconds() {
        return seconds;
    }

    /***
     * 当前交通灯下 做些什么
     */
    public abstract void invokeCurrentLight();

    public static void main(String[] args) {
        TrafficLight.Green.invokeCurrentLight();
    }
}
