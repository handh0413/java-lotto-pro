package lotto.view;

import lotto.controller.LottoGame;
import lotto.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class OutputViewTest {
    @Test
    public void 구매_로또_출력하기() {
        LottoMachine machine = new LottoMachine(5000);
        PurchasedLotto lottos = machine.purchaseLotto();
        OutputView.printMyLotto(lottos);
    }

    @Test
    public void 로또_당첨통계_출력하기() {
        List<Lotto> lottoList = Arrays.asList(
                new Lotto(1, 2, 3, 4, 5, 6),
                new Lotto(1, 2, 3, 4, 5, 7),
                new Lotto(1, 2, 3, 4, 7, 8),
                new Lotto(1, 2, 3, 7, 8, 9));
        PurchasedLotto purchasedLotto = new PurchasedLotto(lottoList);
        LottoResult result = purchasedLotto.matchLottoNumbers(new Lotto("1, 2, 3, 4, 5, 6"), new LottoNo(8));
        OutputView.showLottoStatistics(result);
    }
}
