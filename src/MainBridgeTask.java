public class MainBridgeTask {
    public static void main(String[] args) {
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();

        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);

        circle.draw(); // Рендеринг Circle на Windows
        square.draw(); // Рендеринг Square на Linux
    }
}