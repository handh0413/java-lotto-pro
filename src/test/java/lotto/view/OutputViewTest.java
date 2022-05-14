package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoGame;
import lotto.domain.Money;
import lotto.domain.PurchasedLottos;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class OutputViewTest {
    @Test
    public void 구매_로또_출력하기() {
        LottoGame game = new LottoGame();
        PurchasedLottos lottos = game.purchaseLotto(new Money(5000));
        OutputView.printMyLotto(lottos);
    }

    @Test
    public void 로또_당첨통계_출력하기() {
        List<Lotto> lottoList = Arrays.asList(
                new Lotto(1, 2, 3, 4, 5, 6),
                new Lotto(1, 2, 3, 4, 5, 7),
                new Lotto(1, 2, 3, 4, 7, 8),
                new Lotto(1, 2, 3, 7, 8, 9));
        PurchasedLottos purchasedLottos = new PurchasedLottos(lottoList);
        OutputView.showLottoStatistics(purchasedLottos, "1, 2, 3, 4, 5, 6");
    }


    @Test
    public void 로또_총_수익률_출력하기() {
        Money money = new Money(5000);
        List<Lotto> lottoList = Arrays.asList(
                new Lotto(1, 2, 3, 4, 5, 6));
        PurchasedLottos purchasedLottos = new PurchasedLottos(lottoList);
        String lastWinningNumbers = "1, 2, 3, 4, 5, 6";
        OutputView.showLottoProfit(purchasedLottos, lastWinningNumbers, money);
    }
}