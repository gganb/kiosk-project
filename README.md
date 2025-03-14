# 🛒 키오스크 주문 시스템




## 📌 프로젝트 개요
이 프로젝트는 햄버거 가게의 키오스크 시스템을 구현한 콘솔 애플리케이션입니다. 사용자는 메뉴를 선택하고, 장바구니에 추가한 후, 주문을 완료할 수 있습니다. 객체 지향 프로그래밍 원칙을 적용하여 메뉴, 장바구니, 결제 흐름을 체계적으로 관리하도록 설계되었습니다.

---

## 🚀 주요 기능
### ✅ 1. 메인 메뉴 출력
- 사용자는 카테고리(Burgers, Drinks, Desserts)를 선택할 수 있습니다.
- 장바구니에 아이템이 있으면 추가적으로 `주문` 및 `취소(Cancel)` 옵션이 표시됩니다.

### ✅ 2. 메뉴 선택 및 장바구니 추가
- 사용자는 카테고리 안에서 개별 메뉴를 선택할 수 있습니다.
- 선택한 메뉴를 장바구니에 추가할 수 있으며, 추가하지 않으면 메인 메뉴로 돌아갑니다.

### ✅ 3. 장바구니 확인 및 주문
- 장바구니의 모든 항목과 총 가격을 확인한 후 주문을 진행할 수 있습니다.
- 주문을 완료하면 장바구니가 초기화됩니다.
- "취소"를 선택하면 장바구니가 비워지고 메인 메뉴로 돌아갑니다.

### ✅ 4. 예외 처리
- 존재하지 않는 번호 입력 시 오류 메시지를 출력하고 재입력하도록 유도합니다.

---
## 시연 영상


##  코드 구조 설명
```plaintext
📂 com.example.kiosk
├── 📂 challenge
│   ├── 📄 Kiosk.java         # 프로그램 흐름을 제어하는 메인 클래스
│   ├── 📄 Menu.java          # 메뉴 카테고리를 관리하는 클래스
│   ├── 📄 MenuItem.java      # 개별 메뉴 항목을 관리하는 클래스
│   ├── 📄 Cart.java          # 장바구니 데이터를 관리하는 클래스
│   ├── 📄 CartManage.java    # 장바구니 추가, 삭제, 주문을 관리하는 클래스
│   ├── 📄 Input.java         # 사용자 입력을 처리하는 유틸리티 클래스
│   ├── 📄 KioskMain.java     # 프로그램의 진입점 (main 메서드 실행)
```

---


## 🛠️ 기술 스택
- **Java** (JDK 17.0.14)


---

## 📌 실행 방법
1. `KioskMain.java`를 실행합니다.
2. 콘솔에서 안내에 따라 메뉴를 선택하고 주문을 진행합니다.
3. 프로그램 종료 시 `0`을 입력합니다.



