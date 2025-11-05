## Welcome!
If you are programming, you are at the right place. This repo contains all of our team code for the 2025-2026 season.

## Requirements
To use this Android Studio project, you will need Android Studio Ladybug (2024.2) or later. 

## Installing Android Studio (a requirement)

You can download it for Windows, macOS, or ChromeOS* here: https://developer.android.com/studio

(*)=ChromeOS device must be compataible with the Linux development environment (found in settings) and allow for it (the allowing part only applies to managed Chromebooks, like school Chromebooks.)


Additonally for Linux users, you can also get Android Studio by using one of these commands in the terminal based on your distro, if your distro is not listed use Google:


Ubuntu/Debian: sudo apt update -y && sudo apt install -y snapd && sudo snap install core && sudo snap install android-studio --classic
    
Fedora: sudo dnf install -y snapd && sudo systemctl enable snapd.socket && sudo ln -s /var/lib/snapd/snap /snap && sudo snap install core && sudo snap install android-studio --classic

Arch: sudo pacman -S --needed git base-devel && git clone https://aur.archlinux.org/snapd.git && cd snapd && makepkg -si --noconfirm && sudo systemctl enable --now snapd.socket && sudo ln -s /var/lib/snapd/snap /snap && sudo snap install core && sudo snap install android-studio --classic

openSUSE: sudo zypper addrepo --refresh https://download.opensuse.org/repositories/system:/snappy/openSUSE_Tumbleweed snappy && sudo zypper --gpg-auto-import-keys refresh && sudo zypper dup --from snappy --no-confirm && sudo zypper install -y snapd && sudo systemctl enable --now snapd.socket && sudo systemctl enable --now snapd.apparmor && sudo snap install core && sudo snap install android-studio --classic


## Getting Started
If you are new to robotics or new to the *FIRST* Tech Challenge, then you should consider taking a look at the [FTC Blocks Tutorial](https://ftc-docs.firstinspires.org/programming_resources/blocks/Blocks-Tutorial.html) to get familiar with how to use the control system:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[FTC Blocks Online Tutorial](https://ftc-docs.firstinspires.org/programming_resources/blocks/Blocks-Tutorial.html)

Even if you are an advanced Java programmer, it is helpful to start with the [FTC Blocks tutorial](https://ftc-docs.firstinspires.org/programming_resources/blocks/Blocks-Tutorial.html), and then migrate to the [OnBot Java Tool](https://ftc-docs.firstinspires.org/programming_resources/onbot_java/OnBot-Java-Tutorial.html) or to [Android Studio](https://ftc-docs.firstinspires.org/programming_resources/android_studio_java/Android-Studio-Tutorial.html) afterwards.

## Downloading the Project
If you are an Android Studio programmer, there are several ways to download this repo.

* If you are a git user, you can clone the most current version of the repository using the terminal (Linux) or Command Prompt (Windows):

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;git clone https://github.com/eeimont1/FTC-11241-Blue-Steel.git</p>

## Getting Help
### User Documentation and Tutorials
*FIRST* maintains online documentation with information and tutorials on how to use the *FIRST* Tech Challenge software and robot control system.  You can access this documentation using the following link:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[FIRST Tech Challenge Documentation](https://ftc-docs.firstinspires.org/index.html)

Note that the online documentation is an "evergreen" document that is constantly being updated and edited.  It contains the most current information about the *FIRST* Tech Challenge software and control system.

### Javadoc Reference Material
The Javadoc reference documentation for the FTC SDK is now available online.  Click on the following link to view the FTC SDK Javadoc documentation as a live website:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[FTC Javadoc Documentation](https://javadoc.io/doc/org.firstinspires.ftc)

### Online User Forum
For technical questions regarding the Control System or the FTC SDK, please visit the FIRST Tech Challenge Community site:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[FIRST Tech Challenge Community](https://ftc-community.firstinspires.org/)

### Sample OpModes
This project contains a large selection of Sample OpModes from the FTC SDK (robot code examples) which can be cut and pasted into our /TeamCode folder to be used as-is, or modified.

Samples Folder: &nbsp;&nbsp; [/FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples](FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples)

The readme.md file located in the [/TeamCode/src/main/java/org/firstinspires/ftc/teamcode](TeamCode/src/main/java/org/firstinspires/ftc/teamcode) folder contains an explanation of the sample naming convention, and instructions on how to copy them to our project space.
