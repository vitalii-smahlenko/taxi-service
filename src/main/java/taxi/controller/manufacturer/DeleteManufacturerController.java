package taxi.controller.manufacturer;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.lib.Injector;
import taxi.service.ManufacturerService;

@WebServlet("/manufacturers/delete")
public class DeleteManufacturerController extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(DeleteManufacturerController.class);
    private static final Injector injector = Injector.getInstance("taxi");
    private final ManufacturerService manufacturerService = (ManufacturerService) injector
            .getInstance(ManufacturerService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        long manufacturerId = Long.parseLong(req.getParameter("id"));
        manufacturerService.delete(manufacturerId);
        logger.info("Manufacturer by id {} was deleted", manufacturerId);
        resp.sendRedirect(req.getContextPath() + "/manufacturers");
    }
}
