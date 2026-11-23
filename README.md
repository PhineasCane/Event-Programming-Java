<div align="center">

# ⚡ Event-Driven Programming in Java

**From foundational event loops and the Observer Pattern to Swing GUIs, reactive JavaFX bindings, asynchronous concurrency, and a full-stack MySQL University Management System.**

[![Java](https://img.shields.io/badge/Java-21%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Java Swing](https://img.shields.io/badge/GUI-Java%20Swing-007396?style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![JavaFX](https://img.shields.io/badge/UI-JavaFX%2021-4285F4?style=for-the-badge&logo=java&logoColor=white)](https://openjfx.io/)
[![MySQL](https://img.shields.io/badge/Database-MySQL%208.3-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Build-Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

[Tech Stack](#-tech-stack--architecture) • [Course Roadmap](#-weekly-curriculum-rundown) • [Capstone System](#-capstone-architecture-week-10) • [Quick Start](#-how-to-run-locally)

</div>

---

## 🛠 Tech Stack & Architecture

| Layer | Technologies & APIs Used | Purpose |
| :--- | :--- | :--- |
| **Core Language** | Java 21 (Lambdas, Functional Interfaces, Generics, Concurrency) | Core application logic, event callbacks, and multi-threading |
| **Desktop GUI (Legacy/Enterprise)** | Java Swing (`JFrame`, `JPanel`, `JTable`, `JList`, `JTree`, `JTabbedPane`, `JFileChooser`) | Layout management, custom cell renderers, and EDT event dispatch |
| **Modern Reactive UI** | JavaFX 21 (`FXML`, `Scene Builder`, `Property`, `Bindings`, `TableView`) | Declarative UI layouts, observable models, and unidirectional/bidirectional data binding |
| **Asynchronous Concurrency** | `SwingUtilities.invokeLater`, `Platform.runLater`, `javafx.concurrent.Task`, `Service`, `ScheduledExecutorService` | Non-blocking background I/O, progress reporting, and scheduled polling |
| **Database & Persistence** | MySQL 8.x, JDBC (`mysql-connector-j`), `PreparedStatement` | Relational schema design (`programs`, `students`) and SQL-injection-safe queries |
| **Build & Tooling** | Apache Maven (`javafx-maven-plugin`), VS Code, Git & GitHub | Dependency management, compilation, and version control |

---

## 🗺 Weekly Curriculum Rundown

> **Tip:** Click any week below to expand its modules, key engineering concepts, and runnable source files.

<details open>
<summary><b>Week 1 — Event-Driven Programming Fundamentals</b> (<code>week01-edp-fundamentals/</code>)</summary>
<br>

- **Core Concepts:** Event Sources, Event Objects, Listeners, Handlers, FIFO Event Queues, and the Event Dispatch Thread (EDT).
- **What's Inside:**
  - `activity1-scavenger-hunt/` — Component breakdown of 8 real-world event-driven systems.
  - `activity2-event-loop/` — Event loop simulation & analysis on why blocking handlers freeze UIs.
  - `activity3-calculators/` — Side-by-side comparison of a CLI `ProceduralCalculator` vs. a Swing `EventDrivenCalculator`.
  - `activity4-bug-fix-challenge/` — Diagnosed and patched 4 classic GUI defects (`Bug1_BlockingEDT`, `Bug2_MissingListener`, `Bug3_WrongThread`, `Bug4_MemoryLeak`).
  - `activity5-system-design/` — Architecture spec (`SystemDesign.md`) and working `SmartHomePrototype` with alarm triggers and timestamped event logging.
</details>

<details>
<summary><b>Week 2 — The Observer Pattern & Declarative FXML</b> (<code>week02-observer-pattern/</code>)</summary>
<br>

- **Core Concepts:** Loose coupling via Subject/Observer interfaces, JavaBeans `PropertyChangeSupport`, and separating UI markup (FXML) from controller logic.
- **What's Inside:**
  - Custom Weather Station implementation broadcasting state updates to multiple subscribers.
  - `PropertyChangeDemo` using `java.beans.PropertyChangeListener`.
  - `calculator-fx/` — Maven-based JavaFX calculator (`calculator.fxml` + `CalculatorController.java`) using `@FXML` event wiring.
</details>

<details>
<summary><b>Week 3 — Swing Foundations & Layout Managers</b> (<code>week03-swing-basics/</code>)</summary>
<br>

- **Core Concepts:** Container hierarchy, `BorderLayout`, `GridLayout`, `FlowLayout`, `BoxLayout`, and thread-safe startup on the EDT.
- **What's Inside:**
  - Interactive Swing widget exercises (`JButton`, `JTextField`, `JComboBox`, `JCheckBox`, `JRadioButton`).
  - Multi-panel **Student Portal** UI mockup combining nested layout managers.
</details>

<details>
<summary><b>Week 4 — Event Handling Mechanics</b> (<code>week04-event-handling/</code>)</summary>
<br>

- **Core Concepts:** `ActionListener`, `ItemListener`, real-time `DocumentListener`, `MouseListener`/`MouseMotionListener`, `KeyListener`, and keyboard mnemonics/accelerators.
- **What's Inside:**
  - Interactive Counter App with keyboard shortcuts.
  - Hand-coded Registration Form with live input validation.
  - `activity7-mouse-and-key/` — Freehand canvas (`DrawingApp.java`) and keyboard-controlled sprite movement (`KeyboardMover.java`).
</details>

<details>
<summary><b>Week 5 — Advanced Swing Components & Custom Renderers</b> (<code>week05-advanced-swing/</code>)</summary>
<br>

- **Core Concepts:** MVC table/list/tree models, custom cell rendering, split panes, menus, toolbars, and native file dialogs.
- **What's Inside:**
  - `activity1-jlist-renderer/` — `ContactListDemo.java` with custom `DefaultListCellRenderer` drawing status indicator icons.
  - `activity2-jtable/` — `StudentTableDemo.java` with `DefaultTableModel`, selective cell editing, and conditional red text rendering for GPAs `< 3.0`.
  - `activity3-jtree-tabs/` — `FileExplorerDemo.java` combining `JSplitPane`, hierarchical `JTree`, and `JTabbedPane`.
  - `activity4-menus-dialogs/` — `MiniEditor.java` featuring `JMenuBar`, `JToolBar`, `JFileChooser` open/save workflows, `JOptionPane` confirmations, and live word count.
  - `activity5-capstone-file-manager/` — `FileManager.java` desktop file browser navigating the local filesystem with directory trees, metadata tables, and double-click traversal.
</details>

<details>
<summary><b>Weeks 6 & 7 — Transitioning to JavaFX & Scene Architecture</b></summary>
<br>

- **Core Concepts:** JavaFX Application lifecycle (`Stage`, `Scene`, Scene Graph), CSS styling, FXML loader pipelines, and multi-view navigation.
</details>

<details>
<summary><b>Week 8 — JavaFX Properties & Reactive Bindings</b> (<code>week08-javafx-bindings/</code>)</summary>
<br>

- **Core Concepts:** Observable data models (`StringProperty`, `IntegerProperty`), `InvalidationListener` vs. `ChangeListener`, unidirectional `.bind()`, and bidirectional `.bindBidirectional()`.
- **What's Inside:**
  - `Person.java` observable domain model & `ListenerDemo.java`.
  - `UnidirectionalDemo.java` (live text concatenation) & `BidirectionalDemo.java` (`Slider` ↔ `TextField` sync via `NumberStringConverter`).
  - `ReactiveFormApp.java` — Declarative registration form with live character counter, real-time greeting preview, and automatic `disableProperty()` validation.
</details>

<details>
<summary><b>Week 9 — Asynchronous Programming in JavaFX</b> (<code>week09-async-javafx/</code>)</summary>
<br>

- **Core Concepts:** Preventing UI freezes on the JavaFX Application Thread, background `Task<V>`, `Platform.runLater()`, progress property binding, and restartable `Service<V>`.
- **What's Inside:**
  - `FreezeDemo.java` — Intentional main-thread blocking demonstration.
  - `TaskDemo.java` — Offloading work to a background `Task` with safe UI callbacks.
  - `ProgressDemo.java` — Binding `ProgressBar` and `Label` directly to `updateProgress()` and `updateMessage()`.
  - `ServiceDemo.java` — Reusable `DataSyncService` supporting `restart()`, `cancel()`, and indeterminate `ProgressIndicator` states.
</details>

<details open>
<summary><b>Week 10 — Capstone: University Management System (EDA + MySQL)</b> (<code>week10-university-system/</code>)</summary>
<br>

- **Core Concepts:** Full-stack Event-Driven Architecture (EDA), Producer-Consumer background database tasks, `ScheduledExecutorService` heartbeat polling, and observable `TableView` bindings.
- **What's Inside:**
  - `DatabaseUtil.java` — JDBC connection bridge to `university_db`.
  - `Student.java` — JavaFX property-backed model bound to `TableColumn` cell value factories.
  - `LoadStudentsTask.java` — Background `Task<ObservableList<Student>>` executing `SELECT` queries off the UI thread.
  - `StudentView.fxml` & `StudentController.java` — Reactive form validation (`disableProperty().bind(...)`) and asynchronous `INSERT` + refresh workflow.
  - `MainView.fxml`, `MainController.java` & `App.java` — `BorderPane` shell with sidebar view switching and a 5-second `ScheduledExecutorService` background monitor.
</details>

---

## 🏛 Capstone Architecture (Week 10)

```text
┌─────────────────────────────┐         UI Events          ┌──────────────────────────────┐
│      JavaFX View Layer      │ ─────────────────────────► │      FXML Controllers        │
│ (MainView & StudentView)    │ ◄───────────────────────── │ (Main & StudentController)   │
└─────────────────────────────┘   ObservableList Bindings  └──────────────┬───────────────┘
                                                                          │ Spawns Background
                                                                          │ Task<T> (Producer)
                                                                          ▼
┌─────────────────────────────┐      JDBC / SQL Queries    ┌──────────────────────────────┐
│     MySQL 8.x Database      │ ◄───────────────────────── │   LoadStudentsTask / Save    │
│ (university_db: students,   │ ─────────────────────────► │   (Worker Thread Consumer)   │
│  programs)                  │    ResultSet / Updates     └──────────────────────────────┘
└─────────────────────────────┘