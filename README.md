# FTC Team 11241 Blue Steel

## Welcome!

Welcome to the official code repository for the 2025-2026 season! This project contains all our team code for 2025-2026.

## Requirements

To work on this project, you will need **Android Studio Ladybug (2024.2) or newer**.

## Installation

You must install Android Studio on your computer to contribute code.

* **Windows / macOS:**
    * Download and install from the [Android Studio website](https://developer.android.com/studio).

* **ChromeOS:**
    * Your device must be compatible with the Linux development environment.
    * You may need to enable this in your settings. (On managed school Chromebooks, you might need admin permission).

* **Linux (via Snap):**
    * Open your terminal and run the commands for your distribution.

    * **Ubuntu/Debian:**
        ```bash
        sudo apt update -y && sudo apt install -y snapd
        sudo snap install core
        sudo snap install android-studio --classic
        ```

    * **Fedora:**
        ```bash
        sudo dnf install -y snapd
        sudo systemctl enable --now snapd.socket
        sudo ln -s /var/lib/snapd/snap /snap
        sudo snap install core
        sudo snap install android-studio --classic
        ```

    * **Arch:**
        ```bash
        sudo pacman -S --needed git base-devel
        git clone [https://aur.archlinux.org/snapd.git](https://aur.archlinux.org/snapd.git)
        cd snapd
        makepkg -si --noconfirm
        sudo systemctl enable --now snapd.socket
        sudo ln -s /var/lib/snapd/snap /snap
        sudo snap install core
        sudo snap install android-studio --classic
        ```

    * **openSUSE:**
        ```bash
        sudo zypper addrepo --refresh [https://download.opensuse.org/repositories/system:/snappy/openSUSE_Tumbleweed](https://download.opensuse.org/repositories/system:/snappy/openSUSE_Tumbleweed) snappy
        sudo zypper --gpg-auto-import-keys refresh
        sudo zypper dup --from snappy --no-confirm
        sudo zypper install -y snapd
        sudo systemctl enable --now snapd.socket
        sudo systemctl enable --now snapd.apparmor
        sudo snap install core
        sudo snap install android-studio --classic
        ```

---

## Getting Started with programming

If you are new to programming for FTC, we recommend following looking at these resources:

1.  **FTC Blocks:** Start with the [Blocks Tutorial](https://ftc-docs.firstinspires.org/programming_resources/blocks/Blocks-Tutorial.html).
2.  **OnBot Java:** Once comfortable, you can look at the [OnBot Java Tutorial](https://ftc-docs.firstinspires.org/programming_resources/onbot_java/OnBot-Java-Tutorial.html).
3.  **Android Studio:** This is what we use. Follow the [Android Studio Tutorial](https://ftc-docs.firstinspires.org/programming_resources/android_studio_java/Android-Studio-Tutorial.html).

---

## Getting the Code

There are a few ways to get this project onto your computer.

### 1. GitHub Desktop (Recommended)

This is the easiest way to clone the repository and sync your changes.
1.  Download [GitHub Desktop](https://desktop.github.com/).
2.  In the app, go to **File > Clone Repository**.
3.  Select the `eeimont1/FTC-11241-Blue-Steel` repository to clone it.

### 2. Using `git clone` (Advanced)

If you are comfortable with the terminal, you can clone the repository using this command:

```bash
git clone [https://github.com/eeimont1/FTC-11241-Blue-Steel.git](https://github.com/eeimont1/FTC-11241-Blue-Steel.git)

---

## Importing the Project in Android Studio

After you have cloned the repository to your computer, you need to open it correctly in Android Studio.

1.  Open Android Studio.
2.  From the welcome screen, select **Open**. (If you already have another project open, go to **File > Open...**).
3.  Navigate to the folder where you cloned the repository (e.g., `.../GitHub/FTC-11241-Blue-Steel`).
4.  Select the root folder (the one with `build.gradle` in it) and click **OK**.
5.  **Important:** Wait patiently for Android Studio to index files and for the "Gradle Sync" to complete. This can take several minutes. You can monitor its progress in the status bar at the bottom of the window.

You only need to do this once. The project will now appear in your recent projects list.
